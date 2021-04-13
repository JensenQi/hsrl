package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnhanceOMechano_2075 : Card() {
    override val id = 2075
    override val name = "强化机器人"
    override val description = "<b>战吼：</b>随机使你的其他随从分别获得<b>风怒</b>，<b>嘲讽</b>，或者<b>圣盾</b>效果中的一种。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "每个人都喜欢他的免胶水强化装置！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/899542ba14106c607507cb1927a1c1b98eca0b096992a40fabfc151f36d39623.png"
}
