package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Skyvateer_56091 : Card() {
    override val id = 56091
    override val name = "空中私掠者"
    override val description = "<b>潜行</b> <b>亡语：</b>抽一张牌。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "要是飞艇上没有水果，空中的日子一定不好过。"
    override val artist = "Ludo Lullabi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c95737989b90107104a5b55e11cf12ba5e80261ae3bef667d49095cb8469f09a.png"
}
