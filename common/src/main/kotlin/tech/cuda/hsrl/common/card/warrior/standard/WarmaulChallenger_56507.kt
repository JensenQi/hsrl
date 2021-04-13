package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WarmaulChallenger_56507 : Card() {
    override val id = 56507
    override val name = "战槌挑战者"
    override val description = "<b>战吼：</b> 选择一个敌方随从。与其战斗至死！"
    override var cost: Int? = 3
    override var health: Int? = 10
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "角斗老规矩：谁先死谁输。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/aa01e279ac8d57b138bf9c0b8fbad69a2593d0d1b2c7c78784ef92b1783ce5f7.png"
}
