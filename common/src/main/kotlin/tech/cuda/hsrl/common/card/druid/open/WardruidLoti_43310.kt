package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WardruidLoti_43310 : Card() {
    override val id = 43310
    override val name = "战争德鲁伊罗缇"
    override val description = "<b>抉择：</b>将该随从变形成为罗缇的四种恐龙形态之一。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "“暴掠龙！太吓人了……巴拉蒙多龙！这是什么鬼？斯马克顿龙！嗯……就决定是你了！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd2f020025a2063e0e16d0dd7e0790bede211de09ad4b737c7ef41963ab2828c.png"
}
