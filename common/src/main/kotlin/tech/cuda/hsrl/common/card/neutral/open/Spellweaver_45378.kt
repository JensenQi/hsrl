package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellweaver_45378 : Card() {
    override val id = 45378
    override val name = "织法者"
    override val description = "<b>法术伤害+2</b>"
    override var cost: Int? = 6
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "法术的透气性要比棉布好两倍。"
    override val artist = "Jaemin Kim"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fda50b8e81dc96f2b694e29463ae1d8fbf6a4fe6a17e55f17bb5e1315de35486.png"
}
