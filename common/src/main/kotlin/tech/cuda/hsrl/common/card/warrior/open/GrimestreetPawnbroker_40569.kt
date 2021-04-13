package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GrimestreetPawnbroker_40569 : Card() {
    override val id = 40569
    override val name = "污手街典当师"
    override val description = "<b>战吼：</b>随机使你手牌中的一张武器牌获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Msog
    override val background = "我这里没有二手的“地精大战侏儒”卡牌，你去别的地方找找吧。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8535c8ad4bdc07132c0e8eb7f2d7967fd61e1203a3993fde7757451e85219237.png"
}
