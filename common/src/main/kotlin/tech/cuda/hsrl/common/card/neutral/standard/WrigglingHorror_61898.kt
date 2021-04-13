package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WrigglingHorror_61898 : Card() {
    override val id = 61898
    override val name = "蠕动的恐魔"
    override val description = "<b>战吼：</b>使相邻的随从获得+1/+1。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "生而蠕动，生而恐怖。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9f350fe7f82b8f06960673fd090ceaf0259d5c280518023ea395044973c03b52.png"
}
