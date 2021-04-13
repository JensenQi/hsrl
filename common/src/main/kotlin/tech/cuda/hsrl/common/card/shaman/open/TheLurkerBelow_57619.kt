package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheLurkerBelow_57619 : Card() {
    override val id = 57619
    override val name = "鱼斯拉"
    override val description = "<b>战吼：</b>对一个敌方随从造成3点伤害。如果该随从死亡，则对一个相邻的随从重复此效果。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“快把它扔回去！快扔回去！”"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d61746d42dd0b07c1a3f4c1f094b05fccf6864f373c4fcd679dd44713ba69573.png"
}
