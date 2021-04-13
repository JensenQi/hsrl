package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AntiqueHealbot_2037 : Card() {
    override val id = 2037
    override val name = "老式治疗机器人"
    override val description = "<b>战吼：</b>为你的英雄恢复 8点生命值。"
    override var cost: Int? = 5
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "由于可能会因为爆炸而影响患者的治疗，这种类型的机器人已经停产很久了。"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c9e8c83f73ce8611ef5c1646370bd61c3347736471c25a91694615d043e5f8f7.png"
}
