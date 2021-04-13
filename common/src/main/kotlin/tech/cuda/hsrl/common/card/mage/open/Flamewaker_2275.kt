package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Flamewaker_2275 : Card() {
    override val id = 2275
    override val name = "火妖"
    override val description = "在你施放一个法术后，造成2点伤害，随机分配到所有敌人身上。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Brm
    override val background = "他们深居于炎热的洞窟之中，听候管理者的命令：消灭一切胆敢打扰炎魔之王的敌人。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b82fbb3e0e1e2e79b6bcf02ddc7da741a2caae882f644d64bf1eb8964b161f2a.png"
}
