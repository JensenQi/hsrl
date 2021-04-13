package tech.cuda.hsrl.common.card.warrior.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Upgrade_69954 : Card() {
    override val id = 69954
    override val name = "升级"
    override val description = "如果你装备一把武器，使它获得+1/+1。否则，装备一把1/3的武器。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ClassicCards
    override val background = "50点DKP玩一下，值！"
    override val artist = "Matt Cavotta"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3ba4dc6ef775a968b2e2406870ebdea20558219edaa28f1a518712afab589231.png"
}
