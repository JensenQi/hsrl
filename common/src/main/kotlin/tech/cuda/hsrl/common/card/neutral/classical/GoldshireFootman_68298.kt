package tech.cuda.hsrl.common.card.neutral.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GoldshireFootman_68298 : Card() {
    override val id = 68298
    override val name = "闪金镇步兵"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ClassicCards
    override val background = "如果闪金镇都是由1/2的步兵把守的话，那它早在多年以前就被毁了。"
    override val artist = "Donato Giancola"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3f545a505943044434288d5722b424937e63f33af57a4e883cbff1fa053890a8.png"
}
