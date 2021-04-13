package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WitchwoodPiper_47142 : Card() {
    override val id = 47142
    override val name = "女巫森林吹笛人"
    override val description = "<b>战吼：</b>从你的牌库中抽一张法力值消耗最低的随从牌。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "她经常帮村民们驱逐吵闹之物，比如说老鼠或是熊孩子。"
    override val artist = "Ursula Dorada"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eee21be2866563755ee8499c1c945a91dd031bf5168a642928b782715f3a8682.png"
}
