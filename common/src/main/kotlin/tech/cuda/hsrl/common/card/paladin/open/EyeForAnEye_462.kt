package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EyeForAnEye_462 : Card() {
    override val id = 462
    override val name = "以眼还眼"
    override val description = "<b>奥秘：</b> 当你的英雄受到伤害时，对敌方英雄造成等量伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "有时正义的表现形式就是这么简单：紧握的拳头打在瘫软的脸上。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1327ecb4a6efa63bdd87424331d7a19a923b10b42ce21ad3eab131ec54ae500f.png"
}
