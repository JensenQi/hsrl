package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RavagingGhoul_38530 : Card() {
    override val id = 38530
    override val name = "暴虐食尸鬼"
    override val description = "<b>战吼：</b>对所有其他随从造成1点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "别看他个头不大，脾气倒不小。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c5199cd15f92352d3bed22ed8eb3436262407e19964fa698a97f999e0d4c7650.png"
}
