package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Rokara_63125 : Card() {
    override val id = 63125
    override val name = "洛卡拉"
    override val description = "<b>突袭</b> 在一个友方随从攻击并没有死亡后，使其获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“小心前进，穿好重装，集中队形。为了力量与荣耀！”——洛卡拉"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d372bdfb39616ccd35b3d949d1cd3e092993c8da17352f212dcafa468eaf74a4.png"
}
