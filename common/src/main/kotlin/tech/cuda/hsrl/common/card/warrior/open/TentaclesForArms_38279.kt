package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TentaclesForArms_38279 : Card() {
    override val id = 38279
    override val name = "钢铁触须"
    override val description = "<b>亡语：</b>将这把武器移回你的手牌。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Wotog
    override val background = "要是打不赢仗，加尔鲁什会用这条钢铁触须抽死你。"
    override val artist = "Alex Konstad"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/39177514b401be040e0c268e721f4c3ddc9c06c425906ee26574187adce282e8.png"
}
