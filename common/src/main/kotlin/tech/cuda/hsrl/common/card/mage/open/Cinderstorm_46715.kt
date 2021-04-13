package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Cinderstorm_46715 : Card() {
    override val id = 46715
    override val name = "燃烬风暴"
    override val description = "造成 5点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.TheWitchwood
    override val background = "天气预报：火球红色预警信号！请关闭门窗，避免一切户外活动。"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5f651437c44d06dd32d1d735f6d31f778469c0e4b36f51e577ade002e1d57d6e.png"
}
