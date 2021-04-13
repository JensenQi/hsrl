package tech.cuda.hsrl.common.card.druid.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientOfWar_69875 : Card() {
    override val id = 69875
    override val name = "战争古树"
    override val description = "<b>抉择：</b> +5攻击力；或者+5生命值并具有<b>嘲讽</b>。"
    override var cost: Int? = 7
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ClassicCards
    override val background = "年轻的暗夜精灵们喜欢一种叫做“谁能让战争古树站起来”的游戏。如果在它起身的时候你被踩死了，你还是输了。"
    override val artist = "Sean O’Daniels"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/824696047a34847fa5b51b7718555c4049ce16a3bdbccb0fe0e596297971888e.png"
}
