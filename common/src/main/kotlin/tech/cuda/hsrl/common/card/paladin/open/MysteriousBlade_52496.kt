package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MysteriousBlade_52496 : Card() {
    override val id = 52496
    override val name = "神秘之刃"
    override val description = "<b>战吼：</b> 如果你控制一个<b>奥秘</b>，便获得+1攻击力。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RiseOfShadows
    override val background = "它知道你的所有秘密。"
    override val artist = "Vlad Botos"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eb28bca9e3d3fa6eb1f1caec2886af7734606722840b833b50b055636d8709cf.png"
}
