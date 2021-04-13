package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MeanstreetMarshal_40577 : Card() {
    override val id = 40577
    override val name = "海象人执法官"
    override val description = "<b>亡语：</b>如果该随从的攻击力大于或等于2，抽一张牌。"
    override var cost: Int? = 1
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Msog
    override val background = "所有赃物必须上缴给我，这是法律规定的！"
    override val artist = "Richie Marella"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d292eb234a5e243baa099445e48711710c8019b7d36439b1c8d67a30e556a683.png"
}
