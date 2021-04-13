package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Powermace_2004 : Card() {
    override val id = 2004
    override val name = "动力战锤"
    override val description = "<b>亡语：</b>随机使一个友方机械获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "人们通常认为萨满祭司控制着元素，而事实上，他们必须经常恳求元素施舍一些它们根本不在意的东西。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f99050f0e9f007f0a9130b0f7ff39e9935d31ab695bb8fa2a87e18921efa2ec5.png"
}
