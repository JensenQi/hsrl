package tech.cuda.hsrl.common.card.druid.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TwilightRunner_59614 : Card() {
    override val id = 59614
    override val name = "夜行虎"
    override val description = "<b>潜行</b> 每当该随从攻击，抽两张牌。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "每天早上你都会在家门前发现两张死掉的卡牌。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0223813d52320fa3e353728abdf9b6af20e8579569f6c0702ed0862bb41fa297.png"
}
