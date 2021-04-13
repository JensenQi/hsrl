package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BookOfSpecters_47054 : Card() {
    override val id = 47054
    override val name = "怨灵之书"
    override val description = "抽三张牌。 弃掉抽到的所有法术牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "曾一度名列睡前读物畅销榜的榜首。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/30a6f2b0397edf987ee965518cb31f121ae1c197f898765724b1c532eacf401c.png"
}
