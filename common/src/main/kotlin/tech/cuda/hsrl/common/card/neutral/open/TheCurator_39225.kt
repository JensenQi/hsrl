package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheCurator_39225 : Card() {
    override val id = 39225
    override val name = "馆长"
    override val description = "<b>嘲讽，战吼：</b>从你的牌库中抽一张野兽牌、龙牌和鱼人牌。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "年久失修的馆长，脾气也变得十分古怪。"
    override val artist = "Wei Wang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9fcf71b919ec713b0b728ef1654f4acaf170927d33968e251fa973713c36c8ca.png"
}
