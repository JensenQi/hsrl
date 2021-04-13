package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BulwarkOfAzzinoth_57721 : Card() {
    override val id = 57721
    override val name = "埃辛诺斯壁垒"
    override val description = "每当你的英雄即将受到伤害，改为埃辛诺斯壁垒失去1点耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.AshesOfOutland
    override val background = "扎死他，壁垒！壁垒！No one wants to be defeated！"
    override val artist = "SARIYA"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d3ab1bcfd600c8ecb178864452ed20b4409d06a2ae89386d9849afdf876f3a4a.png"
}
