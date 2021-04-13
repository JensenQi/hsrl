package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AshtongueSlayer_56378 : Card() {
    override val id = 56378
    override val name = "灰舌杀手"
    override val description = "<b>战吼：</b>在本回合中，使一个<b>潜行</b>的随从获得+3攻击力和<b>免疫</b>。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "她的其他手部附件还包括木塞钻和开罐器。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/69c9521254d37e1ef19566b8d3675cc8294cef559a9c06e6a4320a0096bffd7d.png"
}
