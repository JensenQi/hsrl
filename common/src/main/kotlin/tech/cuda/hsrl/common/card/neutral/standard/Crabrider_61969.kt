package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Crabrider_61969 : Card() {
    override val id = 61969
    override val name = "螃蟹骑士"
    override val description = "<b>突袭，风怒</b>"
    override var cost: Int? = 2
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“鱼人骑手坐在哪里最合适？”“蟹腰。”"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ba17b8b8beb5814e536285b8456c8c7246443f5ac27513b48ac721351dda98f8.png"
}
