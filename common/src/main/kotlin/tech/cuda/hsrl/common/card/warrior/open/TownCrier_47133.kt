package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TownCrier_47133 : Card() {
    override val id = 47133
    override val name = "城镇公告员"
    override val description = "<b>战吼：</b>从你的牌库中抽一张具有<b>突袭</b>的随从牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.TheWitchwood
    override val background = "他小时候是镇子里出了名的爱哭鬼。"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0277328e30d8881155d8e5c8fe23dd32fe653e02cffec42621f4a7ca5512ddd2.png"
}
