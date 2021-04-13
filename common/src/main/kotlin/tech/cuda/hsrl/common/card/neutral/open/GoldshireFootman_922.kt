package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoldshireFootman_922 : Card() {
    override val id = 922
    override val name = "闪金镇步兵"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "如果闪金镇都是由1/2的步兵把守的话，那它早在多年以前就被毁了。"
    override val artist = "Donato Giancola"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/52bbcfb67321bad6cf0a6080da53f695dcd958b082f26c7d61e38a2172b0fbd4.png"
}
