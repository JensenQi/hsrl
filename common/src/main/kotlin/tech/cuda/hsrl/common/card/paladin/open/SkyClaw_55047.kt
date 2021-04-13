package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkyClaw_55047 : Card() {
    override val id = 55047
    override val name = "空中飞爪"
    override val description = "你的其他机械获得+1攻击力。<b>战吼：</b>召唤两个1/1的微型 旋翼机。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.DescentOfDragons
    override val background = "经过仔细的调校，永远都抓不住那个大布偶米米尔隆。"
    override val artist = "Jim Nelson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9bf2c29800e166f6778e0a08d0885466b90762e677e05e7251ca3702f87e1e46.png"
}
