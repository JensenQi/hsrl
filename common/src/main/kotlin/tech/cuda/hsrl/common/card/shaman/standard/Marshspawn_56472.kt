package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Marshspawn_56472 : Card() {
    override val id = 56472
    override val name = "沼泽之子"
    override val description = "<b>战吼：</b>如果你在上回合施放过法术，<b>发现</b>一张法术牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "没有了阳鳃的祈祷，赞加沼泽再无晴空。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9280009ef07ba76b29007c4a664808659150789eb7f8a7fede5a39ac334f17b4.png"
}
