package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FantasticFirebird_61298 : Card() {
    override val id = 61298
    override val name = "炫目火鸟"
    override val description = "<b>风怒</b>"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "烧鸡这道菜的创意来源。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eac8a26aa2c38ba70606ee08e1ccf3d8f96dac02abc197ed91d8de27fa2daa54.png"
}
