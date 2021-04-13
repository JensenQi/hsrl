package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeathsBite_1805 : Card() {
    override val id = 1805
    override val name = "死亡之咬"
    override val description = "<b>亡语：</b>对所有随从造成1点伤害。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Naxx
    override val background = "“让死神品味你的血肉。”——死亡领主麦克斯卡夫"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1d0b815a2e246939bf8a978ef5b7f85f796630c31d4b1dea97e2f0f8a077efc5.png"
}
