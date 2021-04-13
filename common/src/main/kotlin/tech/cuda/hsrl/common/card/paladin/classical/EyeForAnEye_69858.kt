package tech.cuda.hsrl.common.card.paladin.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EyeForAnEye_69858 : Card() {
    override val id = 69858
    override val name = "以眼还眼"
    override val description = "<b>奥秘：</b> 当你的英雄受到伤害时，对敌方英雄造成等量伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.ClassicCards
    override val background = "有时正义的表现形式就是这么简单：紧握的拳头打在瘫软的脸上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1e0dd25ddb4ff0b855735c400af664b811c0630fc6fb5740bfdbbf26e28beea4.png"
}
