package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GemstuddedGolem_46027 : Card() {
    override val id = 46027
    override val name = "宝石魔像"
    override val description = "<b>嘲讽</b> 除非你的护甲值大于或等于5点，否则无法进行攻击。"
    override var cost: Int? = 6
    override var health: Int? = 9
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "上面的装饰吸引了无数冒险者。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/cebf702fcdbac1888421abf7f6e3545eafb78b4b74ca416194d322c1b614e17e.png"
}
