package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PraiseGalakrond_55097 : Card() {
    override val id = 55097
    override val name = "赞美迦拉克隆"
    override val description = "使一个随从获得+1攻击力。<b>祈求</b>迦拉克隆。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.DescentOfDragons
    override val background = "“翻到《迦拉克隆》，第3章第12节。‘嘶！嗷！嘎！’让我们一同体味其中的智慧。”"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2b30c6466ebe584b930bbda68308222b483649d0a2702090305834bc3d9b642a.png"
}
