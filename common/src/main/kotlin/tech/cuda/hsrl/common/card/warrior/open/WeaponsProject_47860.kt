package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WeaponsProject_47860 : Card() {
    override val id = 47860
    override val name = "武器计划"
    override val description = "每个玩家装备一把2/3的武器，并获得6点护甲值。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.BoomsdayProject
    override val background = "作为此项计划的发起人，哈里森·琼斯最后被踢出了执行团队。"
    override val artist = "J. Paick & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3601e9f8891f13cb09754063adf97505c75afd7caca62180fe46c28e28c62658.png"
}
