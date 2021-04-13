package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ServantOfKalimos_41410 : Card() {
    override val id = 41410
    override val name = "卡利莫斯的仆从"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，则<b>发现</b>一张元素牌。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "唉…要是当初在学校好好念书，就轮到卡利莫斯来当仆从了。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/82e048fcbe8e6c40ac6dc4fed78e459eb875701132ad51455accab25fe051506.png"
}
