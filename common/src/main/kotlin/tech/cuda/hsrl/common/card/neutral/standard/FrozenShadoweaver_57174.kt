package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrozenShadoweaver_57174 : Card() {
    override val id = 57174
    override val name = "冰霜织影者"
    override val description = "<b>战吼：</b> <b>冻结</b>一个敌人。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "尽管经历了无数次的削弱，她依旧穿着她的冰霜暗纹套装。那就随她吧！"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8dec88c6989172ffd1948a497ca75ee796bef4b1316a826faf9fe957d549e923.png"
}
