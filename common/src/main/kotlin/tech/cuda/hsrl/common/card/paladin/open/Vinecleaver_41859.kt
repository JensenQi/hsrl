package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Vinecleaver_41859 : Card() {
    override val id = 41859
    override val name = "斩棘刀"
    override val description = "在你的英雄攻击后，召唤两个1/1的白银之手 新兵。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "乔治！卡尔！感谢圣光，终于找到你们了！"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5146dd2e11fb94fd8d48cffa1d278030342b294f0a3c82f1161a128737a33277.png"
}
