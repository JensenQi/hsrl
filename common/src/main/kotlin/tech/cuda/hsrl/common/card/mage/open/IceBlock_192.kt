package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceBlock_192 : Card() {
    override val id = 192
    override val name = "寒冰屏障"
    override val description = "<b>奥秘：</b>当你的英雄将要承受致命伤害时，防止这些伤害，并使其在本回合中获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Legacy4
    override val background = "法师们都很奇怪，为什么把一样东西塞进冰箱需要三个步骤？"
    override val artist = "Carl Frank"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dfa550e8287742b406b73e323039b6901a25fa63f4dfb94d940da9be38df4bbf.png"
}
