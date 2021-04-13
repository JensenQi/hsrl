package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Deathwarden_61950 : Card() {
    override val id = 61950
    override val name = "死亡守望者"
    override val description = "<b>亡语</b>不会触发。"
    override var cost: Int? = 3
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "人之将死，其……"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9ee59193b32248d266d83e3765a26ebac39ae2d6ae1156a710af541193910204.png"
}
