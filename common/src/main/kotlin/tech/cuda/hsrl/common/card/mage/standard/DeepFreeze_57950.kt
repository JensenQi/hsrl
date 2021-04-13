package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DeepFreeze_57950 : Card() {
    override val id = 57950
    override val name = "深度冻结"
    override val description = "<b>冻结</b>一个敌人。召唤两个3/6的水元素。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.AshesOfOutland
    override val background = "雪花，雪花，洁白的雪花。 飘呀飘，飘呀飘，给大地披上银纱。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/be55464b33603c2bd2530c17c537fc9cf75dfce94596f5e48fea8c901cc0cba5.png"
}
