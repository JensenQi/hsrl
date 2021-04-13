package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OverlordSaurfang_63274 : Card() {
    override val id = 63274
    override val name = "萨鲁法尔大王"
    override val description = "<b>战吼：</b>复活两个友方<b>暴怒</b>随从。对所有其他随从造成1点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "部落绝不屈服！部落永远顽强！"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d284ebc22eb609cb475871d98cd2089d6c7c3bc14ee5e3e4b55eb5fe34cfd173.png"
}
