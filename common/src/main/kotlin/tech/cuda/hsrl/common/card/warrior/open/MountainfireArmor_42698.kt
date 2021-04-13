package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MountainfireArmor_42698 : Card() {
    override val id = 42698
    override val name = "熔甲卫士"
    override val description = "<b>亡语：</b>如果此时是你对手的回合，则获得 6点护甲值。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Kotf
    override val background = "先生，您的盔甲着火了。"
    override val artist = "Ian Ameling"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/173886c237df69850d2feb4f93c7362a5e4ff6b4d9b0fef098de440f31abcf9f.png"
}
