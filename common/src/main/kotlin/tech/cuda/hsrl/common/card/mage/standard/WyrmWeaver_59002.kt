package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WyrmWeaver_59002 : Card() {
    override val id = 59002
    override val name = "浮龙培养师"
    override val description = "<b>法术迸发：</b>召唤两条1/2的法力浮龙。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "浮夸的学长最终留校；萨莉去了加基森当警员；我去永歌森林培养浮龙：我们都有光明的前途。"
    override val artist = "Bios Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e828a408bcd7b9bbb8637fa7051d757061523277aff91affd7ba8350f7b81c6e.png"
}
