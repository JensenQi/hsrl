package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TrollBatrider_55417 : Card() {
    override val id = 55417
    override val name = "巨魔蝙蝠骑士"
    override val description = "<b>战吼：</b>随机对一个敌方随从造成3点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“闭嘴！蝙蝠听不清路了！”"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/fb25e23eef6eae469a61f9f526ccbf8d447699b45a05d5ea1107b1c7e7a7fbe3.png"
}
