package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CaveHydra_43358 : Card() {
    override val id = 43358
    override val name = "洞穴多头蛇"
    override val description = "同时对其攻击目标相邻的随从造成伤害。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "再加50矿和100气，就可以升级为洞穴潜伏者。"
    override val artist = "Peter Stapleton"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f07185d858ca988e053e78c1f33b65afaeff243c4d06fea9dfc1b38109856b93.png"
}
