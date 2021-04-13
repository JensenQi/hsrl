package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OneEyedCheat_1990 : Card() {
    override val id = 1990
    override val name = "独眼欺诈者"
    override val description = "每当你召唤一个海盗，便获得<b>潜行</b>。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "你不知道他是真的失去了一个眼睛，还是这只是他喜欢的装扮。"
    override val artist = "Danny Beck"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a280209f70b16fba06a7a8dea405a418543d9c0fbc9c8ca7bc659a0aee992822.png"
}
