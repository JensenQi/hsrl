package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingsDefender_2756 : Card() {
    override val id = 2756
    override val name = "国王护卫者"
    override val description = "<b>战吼：</b>如果你控制任何具有<b>嘲讽</b>的随从，便获得+1耐久度。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.Tgt
    override val background = "国王护卫者是把剑，而国王暗杀者是块盾，有趣吧？"
    override val artist = "Michael Franchina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/91e73a837832a71810fc0871638e3e39e0fab857f0eec6d79a5e9f075978cda8.png"
}
