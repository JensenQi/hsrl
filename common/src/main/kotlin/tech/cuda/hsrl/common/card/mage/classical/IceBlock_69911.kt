package tech.cuda.hsrl.common.card.mage.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class IceBlock_69911 : Card() {
    override val id = 69911
    override val name = "寒冰屏障"
    override val description = "<b>奥秘：</b>当你的英雄将要承受致命伤害时，防止这些伤害，并使其在本回合中获得<b>免疫</b>。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ClassicCards
    override val background = "法师们都很奇怪，为什么把一样东西塞进冰箱需要三个步骤？"
    override val artist = "Carl Frank"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0f6e4d72b2e8d47089866146730d0ebf33a4eb5a97a450ff55fa19d58e559a62.png"
}
