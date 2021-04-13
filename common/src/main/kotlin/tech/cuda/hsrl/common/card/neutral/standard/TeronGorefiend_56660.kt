package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TeronGorefiend_56660 : Card() {
    override val id = 56660
    override val name = "塔隆·血魔"
    override val description = "<b>战吼：</b>消灭所有其他友方随从。<b>亡语：</b>再次召唤被消灭的随从并使其获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“没事，友方随从们！你们没事的！别去老大那儿告状！”"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbcd102c8653c2caf5294cbbc5b837f09e0ebd66290a1fa71ce69da790a58782.png"
}
