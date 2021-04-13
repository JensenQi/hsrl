package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DunemaulShaman_2034 : Card() {
    override val id = 2034
    override val name = "砂槌萨满祭司"
    override val description = "<b>风怒，过载：</b>（1） 50%几率攻击错误的敌人。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Gvg
    override val background = "他们的战斗信条是：闭上眼，然后享受打击的快感。"
    override val artist = "José Ladrönn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1315bca46899eeb10b47b81f0cbbbf2203d68b611a11b5350482b833c041b7d7.png"
}
