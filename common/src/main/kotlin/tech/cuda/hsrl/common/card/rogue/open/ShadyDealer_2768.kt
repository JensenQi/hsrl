package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShadyDealer_2768 : Card() {
    override val id = 2768
    override val name = "走私商贩"
    override val description = "<b>战吼：</b>如果你控制任何海盗，便获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Tgt
    override val background = "我这里有笔好买卖……那就是对你的脸造成4点伤害！"
    override val artist = "Tooth"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/716a98b68aefb61c0fed74e541a460959dc58238df21c4b774ac20293d4176dd.png"
}
